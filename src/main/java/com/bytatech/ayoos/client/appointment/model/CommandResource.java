package com.bytatech.ayoos.client.appointment.model;

import java.util.Objects;
import com.bytatech.ayoos.client.appointment.model.Link;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommandResource
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T11:23:29.803+05:30[Asia/Kolkata]")

public class CommandResource {
	@JsonProperty("_links")
	@Valid
	private Link links = null;
	@JsonProperty("trackingId")
	private String trackingId;
	@JsonProperty("nextTaskId")
	private String nextTaskId;
	@JsonProperty("taskName")
	private String taskName;

	/**
	 * @return the trackingId
	 */
	public String getTrackingId() {
		return trackingId;
	}

	/**
	 * @param trackingId the trackingId to set
	 */
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	/**
	 * @return the nextTaskId
	 */
	public String getNextTaskId() {
		return nextTaskId;
	}

	/**
	 * @param nextTaskId the nextTaskId to set
	 */
	public void setNextTaskId(String nextTaskId) {
		this.nextTaskId = nextTaskId;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@JsonProperty("status")
	private String status = null;

	public CommandResource links(Link links) {
		this.links = links;
		return this;
	}

	public CommandResource addLinksItem(Link linksItem) {
		if (this.links == null) {
			this.links = new Link();
		}
		//this.links.add(linksItem);
		return this;
	}

	/**
	 * Get links
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Link getLinks() {
		return links;
	}

	public void setLinks(Link links) {
		this.links = links;
	}

	public CommandResource status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CommandResource commandResource = (CommandResource) o;
		return Objects.equals(this.links, commandResource.links) && Objects.equals(this.status, commandResource.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(links, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CommandResource {\n");

		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
