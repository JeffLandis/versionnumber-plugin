package org.jvnet.hudson.tools.versionnumber;

import hudson.model.Action;

public class VersionNumberAction implements Action {
    static final String ICON = "/plugin/versionnumber/vnicon_24x24.gif";
    
    private VersionNumberBuildInfo info;
    private String versionNumber;
    private String versionCode;
    
    public VersionNumberAction(VersionNumberBuildInfo info, String versionNumber) {
        this.info = info;
        this.versionNumber = versionNumber;
    }
    
    public VersionNumberAction(VersionNumberBuildInfo info, String versionNumber, String versionCode) {
        this.info = info;
        this.versionNumber = versionNumber;
        this.versionCode = versionCode;
    }
    
    public VersionNumberBuildInfo getInfo() {
        return info;
    }

    public String getVersionNumber() {
	return this.versionNumber;
    }

    public String getVersionCode() {
		return versionCode;
	}

	public String getDisplayName() {
        return "Version " + this.versionNumber;
    }

    public String getIconFileName() {
        return ICON;
    }
    
    public String getUrlName() {
        return "versionnumber/displayName";
    }
    
    
}
