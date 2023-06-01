package com.aston.camunda.externaltask;

public class RetryFailureException extends Exception {

    int maxRetry;
    long retryTimeout;

    public RetryFailureException(int maxRetry, long retryTimeout, String message) {
        super(message);
        this.maxRetry = maxRetry;
        this.retryTimeout = retryTimeout;
    }

    public int getMaxRetry() {
        return maxRetry;
    }

    public long getRetryTimeout() {
        return retryTimeout;
    }
}
