package com.wavebigfish.clouddisk.operation.delete;

import com.wavebigfish.clouddisk.operation.delete.domain.DeleteFile;

public abstract class Deleter {
    public abstract void delete(DeleteFile deleteFile);
}