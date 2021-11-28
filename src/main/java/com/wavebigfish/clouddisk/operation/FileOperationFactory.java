package com.wavebigfish.clouddisk.operation;

import com.wavebigfish.clouddisk.operation.delete.Deleter;
import com.wavebigfish.clouddisk.operation.download.Downloader;
import com.wavebigfish.clouddisk.operation.upload.Uploader;

public interface FileOperationFactory {
    Uploader getUploader();
    Downloader getDownloader();
    Deleter getDeleter();
}