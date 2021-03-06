package io.choerodon.devops.infra.dataobject;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;

@ModifyAudit
@Table(name = "devops_env_file")
@VersionAudit
public class DevopsEnvFileDO {

    @Id
    @GeneratedValue
    private Long id;
    private Long envId;
    private String filePath;
    private String devopsCommit;
    private String agentCommit;
    private Long objectVersionNumber;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDevopsCommit() {
        return devopsCommit;
    }

    public void setDevopsCommit(String devopsCommit) {
        this.devopsCommit = devopsCommit;
    }

    public String getAgentCommit() {
        return agentCommit;
    }

    public void setAgentCommit(String agentCommit) {
        this.agentCommit = agentCommit;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }
}
