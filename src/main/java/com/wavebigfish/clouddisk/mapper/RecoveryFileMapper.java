package com.wavebigfish.clouddisk.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wavebigfish.clouddisk.model.RecoveryFile;
import com.wavebigfish.clouddisk.vo.RecoveryFileListVO;

public interface RecoveryFileMapper extends BaseMapper<RecoveryFile> {
    List<RecoveryFileListVO> selectRecoveryFileList();
}