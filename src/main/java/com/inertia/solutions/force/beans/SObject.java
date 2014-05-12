package com.inertia.solutions.force.beans;

import java.io.Serializable;
import java.util.List;

public class SObject implements Serializable{
	private static final long serialVersionUID = -244962549413969369L;
	
	private String name;
	
	private String label;
	
	private String keyPrefix;
	
	private String labelPlural;
	
	private Boolean custom;
	
	private Boolean layoutable;
	
	private Boolean activateable;
	
	SOUrl urls;
	
	private Boolean searchable;
	
	private Boolean updateable;
	
	private Boolean createable;
	
	private Boolean deprecatedAndHidden;
	
	private Boolean customSetting;
	
	private Boolean deletable;
	
	private Boolean feedEnabled;
	
	private Boolean mergeable;
	
	private Boolean queryable;
	
	private Boolean replicateable;
	
	private Boolean retrieveable;
	
	private Boolean undeletable;
	
	private Boolean triggerable;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getKeyPrefix() {
		return keyPrefix;
	}

	public void setKeyPrefix(String keyPrefix) {
		this.keyPrefix = keyPrefix;
	}

	public String getLabelPlural() {
		return labelPlural;
	}

	public void setLabelPlural(String labelPlural) {
		this.labelPlural = labelPlural;
	}

	public Boolean getCustom() {
		return custom;
	}

	public void setCustom(Boolean custom) {
		this.custom = custom;
	}

	public Boolean getLayoutable() {
		return layoutable;
	}

	public void setLayoutable(Boolean layoutable) {
		this.layoutable = layoutable;
	}

	public Boolean getActivateable() {
		return activateable;
	}

	public void setActivateable(Boolean activateable) {
		this.activateable = activateable;
	}

	public Boolean getSearchable() {
		return searchable;
	}

	public void setSearchable(Boolean searchable) {
		this.searchable = searchable;
	}

	public Boolean getUpdateable() {
		return updateable;
	}

	public void setUpdateable(Boolean updateable) {
		this.updateable = updateable;
	}

	public Boolean getCreateable() {
		return createable;
	}

	public void setCreateable(Boolean createable) {
		this.createable = createable;
	}

	public Boolean getDeprecatedAndHidden() {
		return deprecatedAndHidden;
	}

	public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
		this.deprecatedAndHidden = deprecatedAndHidden;
	}

	public Boolean getCustomSetting() {
		return customSetting;
	}

	public void setCustomSetting(Boolean customSetting) {
		this.customSetting = customSetting;
	}

	public Boolean getDeletable() {
		return deletable;
	}

	public void setDeletable(Boolean deletable) {
		this.deletable = deletable;
	}

	public Boolean getFeedEnabled() {
		return feedEnabled;
	}

	public void setFeedEnabled(Boolean feedEnabled) {
		this.feedEnabled = feedEnabled;
	}

	public Boolean getMergeable() {
		return mergeable;
	}

	public void setMergeable(Boolean mergeable) {
		this.mergeable = mergeable;
	}

	public Boolean getQueryable() {
		return queryable;
	}

	public void setQueryable(Boolean queryable) {
		this.queryable = queryable;
	}

	public Boolean getReplicateable() {
		return replicateable;
	}

	public void setReplicateable(Boolean replicateable) {
		this.replicateable = replicateable;
	}

	public Boolean getRetrieveable() {
		return retrieveable;
	}

	public void setRetrieveable(Boolean retrieveable) {
		this.retrieveable = retrieveable;
	}

	public Boolean getUndeletable() {
		return undeletable;
	}

	public void setUndeletable(Boolean undeletable) {
		this.undeletable = undeletable;
	}

	public Boolean getTriggerable() {
		return triggerable;
	}

	public void setTriggerable(Boolean triggerable) {
		this.triggerable = triggerable;
	}

	public SOUrl getUrls() {
		return urls;
	}

	public void setUrls(SOUrl urls) {
		this.urls = urls;
	}

}
