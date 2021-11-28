package com.wavebigfish.clouddisk.operation.download;

import javax.servlet.http.HttpServletResponse;

import com.wavebigfish.clouddisk.operation.download.domain.DownloadFile;

public abstract class Downloader {
    public abstract void download(HttpServletResponse httpServletResponse, DownloadFile uploadFile);
}