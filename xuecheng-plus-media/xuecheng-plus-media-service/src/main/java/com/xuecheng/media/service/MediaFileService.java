package com.xuecheng.media.service;

import com.lhclike.base.model.PageParams;
import com.lhclike.base.model.PageResult;

import com.lhclike.base.model.RestResponse;
import com.xuecheng.media.model.dto.QueryMediaParamsDto;
import com.xuecheng.media.model.dto.UploadFileParamsDto;
import com.xuecheng.media.model.dto.UploadFileResultDto;
import com.xuecheng.media.model.po.MediaFiles;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.util.List;

/**
 * @description 媒资文件管理业务类
 * @author Mr.M
 * @date 2022/9/10 8:55
 * @version 1.0
 */
public interface MediaFileService {

 /**
  * @description 媒资文件查询方法
  * @param pageParams 分页参数
  * @param queryMediaParamsDto 查询条件
  * @return com.xuecheng.base.model.PageResult<com.xuecheng.media.model.po.MediaFiles>
  * @author Mr.M
  * @date 2022/9/10 8:57
 */
 public PageResult<MediaFiles> queryMediaFiels(Long companyId, PageParams pageParams, QueryMediaParamsDto queryMediaParamsDto);
 public UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, String localFilePath);
 public MediaFiles addMediaFilesToDb(Long companyId,String fileMd5,UploadFileParamsDto uploadFileParamsDto,String bucket_Files,String objectName);
 public RestResponse<Boolean> checkChunk(String fileMd5, int chunkIndex);
 public RestResponse uploadChunk(String fileMd5, int chunk, String localChunkFilePath);
 public RestResponse<Boolean> checkFile(String fileMd5);
 public RestResponse mergechunks(Long companyId,String fileMd5,int chunkTotal,UploadFileParamsDto uploadFileParamsDto);
 public File downloadFileFromMinIO(String bucket, String objectName);
 public boolean addMediaFilesToMinIO(String localFilePath, String mimeType, String bucket, String objectName);
 //根据媒资id查询文件信息
 MediaFiles getFileById(String mediaId);

}
