/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import org.joda.time.DateTime;
import java.util.List;

/**
 * The RecommendedActionResourceProperties model.
 */
public class RecommendedActionResourceProperties {
    /**
     * The recommendationReason property.
     */
    private String recommendationReason;

    /**
     * The validSince property.
     */
    private DateTime validSince;

    /**
     * The lastRefresh property.
     */
    private DateTime lastRefresh;

    /**
     * The state property.
     */
    private StateInfo state;

    /**
     * The isExecutableAction property.
     */
    private Boolean isExecutableAction;

    /**
     * The isRevertableAction property.
     */
    private Boolean isRevertableAction;

    /**
     * The isArchivedAction property.
     */
    private Boolean isArchivedAction;

    /**
     * The executeActionStartTime property.
     */
    private DateTime executeActionStartTime;

    /**
     * The executeActionDuration property.
     */
    private String executeActionDuration;

    /**
     * The revertActionStartTime property.
     */
    private DateTime revertActionStartTime;

    /**
     * The revertActionDuration property.
     */
    private String revertActionDuration;

    /**
     * The executeActionInitiatedBy property.
     */
    private String executeActionInitiatedBy;

    /**
     * The executeActionInitiatedTime property.
     */
    private DateTime executeActionInitiatedTime;

    /**
     * The revertActionInitiatedBy property.
     */
    private String revertActionInitiatedBy;

    /**
     * The revertActionInitiatedTime property.
     */
    private DateTime revertActionInitiatedTime;

    /**
     * The score property.
     */
    private Integer score;

    /**
     * The implementationDetails property.
     */
    private ImplementationInfo implementationDetails;

    /**
     * The errorDetails property.
     */
    private ErrorInfo errorDetails;

    /**
     * The estimatedImpact property.
     */
    private List<ImpactRecord> estimatedImpact;

    /**
     * The observedImpact property.
     */
    private List<ImpactRecord> observedImpact;

    /**
     * The timeSeries property.
     */
    private List<MetricInfo> timeSeries;

    /**
     * The linkedObjects property.
     */
    private List<String> linkedObjects;

    /**
     * The details property.
     */
    private Object details;

    /**
     * Get the recommendationReason value.
     *
     * @return the recommendationReason value
     */
    public String recommendationReason() {
        return this.recommendationReason;
    }

    /**
     * Set the recommendationReason value.
     *
     * @param recommendationReason the recommendationReason value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withRecommendationReason(String recommendationReason) {
        this.recommendationReason = recommendationReason;
        return this;
    }

    /**
     * Get the validSince value.
     *
     * @return the validSince value
     */
    public DateTime validSince() {
        return this.validSince;
    }

    /**
     * Set the validSince value.
     *
     * @param validSince the validSince value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withValidSince(DateTime validSince) {
        this.validSince = validSince;
        return this;
    }

    /**
     * Get the lastRefresh value.
     *
     * @return the lastRefresh value
     */
    public DateTime lastRefresh() {
        return this.lastRefresh;
    }

    /**
     * Set the lastRefresh value.
     *
     * @param lastRefresh the lastRefresh value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withLastRefresh(DateTime lastRefresh) {
        this.lastRefresh = lastRefresh;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public StateInfo state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withState(StateInfo state) {
        this.state = state;
        return this;
    }

    /**
     * Get the isExecutableAction value.
     *
     * @return the isExecutableAction value
     */
    public Boolean isExecutableAction() {
        return this.isExecutableAction;
    }

    /**
     * Set the isExecutableAction value.
     *
     * @param isExecutableAction the isExecutableAction value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withIsExecutableAction(Boolean isExecutableAction) {
        this.isExecutableAction = isExecutableAction;
        return this;
    }

    /**
     * Get the isRevertableAction value.
     *
     * @return the isRevertableAction value
     */
    public Boolean isRevertableAction() {
        return this.isRevertableAction;
    }

    /**
     * Set the isRevertableAction value.
     *
     * @param isRevertableAction the isRevertableAction value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withIsRevertableAction(Boolean isRevertableAction) {
        this.isRevertableAction = isRevertableAction;
        return this;
    }

    /**
     * Get the isArchivedAction value.
     *
     * @return the isArchivedAction value
     */
    public Boolean isArchivedAction() {
        return this.isArchivedAction;
    }

    /**
     * Set the isArchivedAction value.
     *
     * @param isArchivedAction the isArchivedAction value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withIsArchivedAction(Boolean isArchivedAction) {
        this.isArchivedAction = isArchivedAction;
        return this;
    }

    /**
     * Get the executeActionStartTime value.
     *
     * @return the executeActionStartTime value
     */
    public DateTime executeActionStartTime() {
        return this.executeActionStartTime;
    }

    /**
     * Set the executeActionStartTime value.
     *
     * @param executeActionStartTime the executeActionStartTime value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withExecuteActionStartTime(DateTime executeActionStartTime) {
        this.executeActionStartTime = executeActionStartTime;
        return this;
    }

    /**
     * Get the executeActionDuration value.
     *
     * @return the executeActionDuration value
     */
    public String executeActionDuration() {
        return this.executeActionDuration;
    }

    /**
     * Set the executeActionDuration value.
     *
     * @param executeActionDuration the executeActionDuration value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withExecuteActionDuration(String executeActionDuration) {
        this.executeActionDuration = executeActionDuration;
        return this;
    }

    /**
     * Get the revertActionStartTime value.
     *
     * @return the revertActionStartTime value
     */
    public DateTime revertActionStartTime() {
        return this.revertActionStartTime;
    }

    /**
     * Set the revertActionStartTime value.
     *
     * @param revertActionStartTime the revertActionStartTime value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withRevertActionStartTime(DateTime revertActionStartTime) {
        this.revertActionStartTime = revertActionStartTime;
        return this;
    }

    /**
     * Get the revertActionDuration value.
     *
     * @return the revertActionDuration value
     */
    public String revertActionDuration() {
        return this.revertActionDuration;
    }

    /**
     * Set the revertActionDuration value.
     *
     * @param revertActionDuration the revertActionDuration value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withRevertActionDuration(String revertActionDuration) {
        this.revertActionDuration = revertActionDuration;
        return this;
    }

    /**
     * Get the executeActionInitiatedBy value.
     *
     * @return the executeActionInitiatedBy value
     */
    public String executeActionInitiatedBy() {
        return this.executeActionInitiatedBy;
    }

    /**
     * Set the executeActionInitiatedBy value.
     *
     * @param executeActionInitiatedBy the executeActionInitiatedBy value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withExecuteActionInitiatedBy(String executeActionInitiatedBy) {
        this.executeActionInitiatedBy = executeActionInitiatedBy;
        return this;
    }

    /**
     * Get the executeActionInitiatedTime value.
     *
     * @return the executeActionInitiatedTime value
     */
    public DateTime executeActionInitiatedTime() {
        return this.executeActionInitiatedTime;
    }

    /**
     * Set the executeActionInitiatedTime value.
     *
     * @param executeActionInitiatedTime the executeActionInitiatedTime value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withExecuteActionInitiatedTime(DateTime executeActionInitiatedTime) {
        this.executeActionInitiatedTime = executeActionInitiatedTime;
        return this;
    }

    /**
     * Get the revertActionInitiatedBy value.
     *
     * @return the revertActionInitiatedBy value
     */
    public String revertActionInitiatedBy() {
        return this.revertActionInitiatedBy;
    }

    /**
     * Set the revertActionInitiatedBy value.
     *
     * @param revertActionInitiatedBy the revertActionInitiatedBy value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withRevertActionInitiatedBy(String revertActionInitiatedBy) {
        this.revertActionInitiatedBy = revertActionInitiatedBy;
        return this;
    }

    /**
     * Get the revertActionInitiatedTime value.
     *
     * @return the revertActionInitiatedTime value
     */
    public DateTime revertActionInitiatedTime() {
        return this.revertActionInitiatedTime;
    }

    /**
     * Set the revertActionInitiatedTime value.
     *
     * @param revertActionInitiatedTime the revertActionInitiatedTime value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withRevertActionInitiatedTime(DateTime revertActionInitiatedTime) {
        this.revertActionInitiatedTime = revertActionInitiatedTime;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Integer score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * Get the implementationDetails value.
     *
     * @return the implementationDetails value
     */
    public ImplementationInfo implementationDetails() {
        return this.implementationDetails;
    }

    /**
     * Set the implementationDetails value.
     *
     * @param implementationDetails the implementationDetails value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withImplementationDetails(ImplementationInfo implementationDetails) {
        this.implementationDetails = implementationDetails;
        return this;
    }

    /**
     * Get the errorDetails value.
     *
     * @return the errorDetails value
     */
    public ErrorInfo errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails value.
     *
     * @param errorDetails the errorDetails value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withErrorDetails(ErrorInfo errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get the estimatedImpact value.
     *
     * @return the estimatedImpact value
     */
    public List<ImpactRecord> estimatedImpact() {
        return this.estimatedImpact;
    }

    /**
     * Set the estimatedImpact value.
     *
     * @param estimatedImpact the estimatedImpact value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withEstimatedImpact(List<ImpactRecord> estimatedImpact) {
        this.estimatedImpact = estimatedImpact;
        return this;
    }

    /**
     * Get the observedImpact value.
     *
     * @return the observedImpact value
     */
    public List<ImpactRecord> observedImpact() {
        return this.observedImpact;
    }

    /**
     * Set the observedImpact value.
     *
     * @param observedImpact the observedImpact value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withObservedImpact(List<ImpactRecord> observedImpact) {
        this.observedImpact = observedImpact;
        return this;
    }

    /**
     * Get the timeSeries value.
     *
     * @return the timeSeries value
     */
    public List<MetricInfo> timeSeries() {
        return this.timeSeries;
    }

    /**
     * Set the timeSeries value.
     *
     * @param timeSeries the timeSeries value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withTimeSeries(List<MetricInfo> timeSeries) {
        this.timeSeries = timeSeries;
        return this;
    }

    /**
     * Get the linkedObjects value.
     *
     * @return the linkedObjects value
     */
    public List<String> linkedObjects() {
        return this.linkedObjects;
    }

    /**
     * Set the linkedObjects value.
     *
     * @param linkedObjects the linkedObjects value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withLinkedObjects(List<String> linkedObjects) {
        this.linkedObjects = linkedObjects;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public Object details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the RecommendedActionResourceProperties object itself.
     */
    public RecommendedActionResourceProperties withDetails(Object details) {
        this.details = details;
        return this;
    }

}