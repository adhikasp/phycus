package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GenotypeList;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CohortData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-13T16:03:03.769+01:00")

public class CohortData  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("GenotypeList")
  private GenotypeList genotypeList = null;
  
  @JsonProperty("name")
  private String name = null;

  public CohortData genotypeList(GenotypeList genotypeList) {
    this.genotypeList = genotypeList;
    return this;
  }

   /**
   * Get genotypeList
   * @return genotypeList
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GenotypeList getGenotypeList() {
    return genotypeList;
  }

  public void setGenotypeList(GenotypeList genotypeList) {
    this.genotypeList = genotypeList;
  }
  
  public CohortData name(String name) {
	    this.name = name;
	    return this;
	  }

   /**
    * Name of the Cohort
    * @return name
    **/
	  @ApiModelProperty(required = true, value = "Name of the cohort")
	  @NotNull


	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CohortData cohortData = (CohortData) o;
    return Objects.equals(this.genotypeList, cohortData.genotypeList) &&
            Objects.equals(this.name, cohortData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genotypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CohortData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genotypeList: ").append(toIndentedString(genotypeList)).append("\n");
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

