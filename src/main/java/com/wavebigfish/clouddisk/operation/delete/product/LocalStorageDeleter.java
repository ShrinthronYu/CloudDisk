package com.wavebigfish.clouddisk.operation.delete.product;

import java.io.File;

import com.wavebigfish.clouddisk.operation.delete.Deleter;
import com.wavebigfish.clouddisk.operation.delete.domain.DeleteFile;
import com.wavebigfish.clouddisk.util.FileUtil;
import com.wavebigfish.clouddisk.util.PathUtil;

import org.springframework.stereotype.Component;

@Component
public class LocalStorageDeleter extends Deleter {
    @Override
    public void delete(DeleteFile deleteFile) {
        File file = new File(PathUtil.getStaticPath() + deleteFile.getFileUrl());
        if (file.exists()) {
            file.delete();
        }
        
        if (FileUtil.isImageFile(FileUtil.getFileExtendName(deleteFile.getFileUrl()))) {
            File minFile = new File(PathUtil.getStaticPath() + deleteFile.getFileUrl().replace(deleteFile.getTimeStampName(), deleteFile.getTimeStampName() + "_min"));
            if (minFile.exists()) {
                minFile.delete();
            }
        }
    }
}