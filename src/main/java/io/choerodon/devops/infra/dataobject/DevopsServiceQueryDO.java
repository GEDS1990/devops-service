package io.choerodon.devops.infra.dataobject;

import java.util.List;
import javax.persistence.Transient;

/**
 * Created by Zenger on 2018/4/19.
 */
public class DevopsServiceQueryDO {

    private Long id;
    private String name;
    private String externalIp;
    private String ports;
    private String status;
    private Long envId;
    private String type;
    private String envName;
    private String namespace;
    private Long appId;
    private String appName;
    private String labels;
    private List<ServiceInstanceDO> appInstance;

    @Transient
    private Long appProjectId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public List<ServiceInstanceDO> getAppInstance() {
        return appInstance;
    }

    public void setAppInstance(List<ServiceInstanceDO> appInstance) {
        this.appInstance = appInstance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public Long getAppProjectId() {
        return appProjectId;
    }

    public void setAppProjectId(Long appProjectId) {
        this.appProjectId = appProjectId;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
