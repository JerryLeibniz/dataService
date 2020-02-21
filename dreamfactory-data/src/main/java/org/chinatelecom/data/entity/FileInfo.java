package org.chinatelecom.data.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author WQ
 * @create 2020-02-05 21:25
 */
public class FileInfo implements Serializable {

    private static final long serialVersionUID = 8936780675265778179L;

    private String id;

    /**
     * 资源名称
     */
    private String fileName;
    //下载时间
    private Timestamp downloadTime;
    /**
     * 0.未下载 1已下载 2已安装
     */
    private Integer fileStatus;
    /**
     * 文件类型0.wget或者;1.docker
     */
    private String resourceType;

    /**
     * 资源下载地址
     */
    private String sourceAddress;
    /**
     * 保存目的目录
     */
    private String toAddress;
    /**
     * 依赖
     * @return
     */
    private String dependency;
    /**
     * 场景
     * @return
     */
    private String scenarios;
    /**
     * 版本
     * @return
     */
    private String fileVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Timestamp getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Timestamp downloadTime) {
        this.downloadTime = downloadTime;
    }

    public Integer getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(Integer fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public String getScenarios() {
        return scenarios;
    }

    public void setScenarios(String scenarios) {
        this.scenarios = scenarios;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }
}
