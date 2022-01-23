package com.upgrad.designpatterns.behavioral.command.alexa;

import ai.rev.speechtotext.ApiClient;
import ai.rev.speechtotext.models.asynchronous.RevAiCaptionType;
import ai.rev.speechtotext.models.asynchronous.RevAiJob;
import ai.rev.speechtotext.models.asynchronous.RevAiJobOptions;
import ai.rev.speechtotext.models.asynchronous.RevAiJobStatus;
import ai.rev.speechtotext.models.asynchronous.RevAiTranscript;
import ai.rev.speechtotext.models.vocabulary.CustomVocabulary;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;


import java.io.IOException;

public class AsyncTranscribeLocalMediaFile {

    public String transcribeAudio(String filePath) {
        String accessToken = "YOUR TOKEN GOES HERE";

// Initialize your client with your access token
        ApiClient apiClient = new ApiClient(accessToken);


        RevAiJobOptions revAiJobOptions = new RevAiJobOptions();
        revAiJobOptions.setMetadata("Sample submit job");
        revAiJobOptions.setCallbackUrl("https://example.com/callback");
        revAiJobOptions.setSkipDiarization(false);
        revAiJobOptions.setSkipPunctuation(false);
        RevAiJob submittedJob;

//        String mediaUrl = "https://www.rev.ai/FTC_Sample_1.mp3";

        System.out.println("CONVERTING AUDIO TO TEXT: " + filePath);
        String pathToLocalFile = (filePath == null || filePath.length() == 0) ? "media/lightOn.mp3" : filePath;
        try {
            // Submit the local file and transcription options

            submittedJob = apiClient.submitJobLocalFile(pathToLocalFile, revAiJobOptions);
//            submittedJob = apiClient.submitJobUrl(mediaUrl, revAiJobOptions);
        } catch (IOException e) {
            throw new RuntimeException("Failed to submit url [" + pathToLocalFile + "] " + e.getMessage());
        }
        String jobId = submittedJob.getJobId();
//        System.out.println("Job Id: " + jobId);
//        System.out.println("Job Status: " + submittedJob.getJobStatus());
//        System.out.println("Created On: " + submittedJob.getCreatedOn());

        // Waits 5 seconds between each status check to see if job is complete
        boolean isJobComplete = false;
        while (!isJobComplete) {
            RevAiJob retrievedJob;
            try {
                retrievedJob = apiClient.getJobDetails(jobId);
            } catch (IOException e) {
                throw new RuntimeException("Failed to retrieve job [" + jobId + "] " + e.getMessage());
            }

            RevAiJobStatus retrievedJobStatus = retrievedJob.getJobStatus();
            if (retrievedJobStatus == RevAiJobStatus.TRANSCRIBED
                    || retrievedJobStatus == RevAiJobStatus.FAILED) {
                isJobComplete = true;
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Get the transcript and caption outputs
        RevAiTranscript objectTranscript;
        String textTranscript = "";

        try {
            objectTranscript = apiClient.getTranscriptObject(jobId);
            textTranscript = apiClient.getTranscriptText(jobId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textTranscript;
    }
}
