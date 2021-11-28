package com.wavebigfish.clouddisk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wavebigfish.clouddisk.mapper.FileMapper;
import com.wavebigfish.clouddisk.model.File;
import com.wavebigfish.clouddisk.service.FileService;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {

}