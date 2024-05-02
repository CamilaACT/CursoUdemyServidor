package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This model represent a Invoice data that user receive when make a request method
 */
@Schema(description = "This model represent a Invoice data that user receive when make a request method")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-01T18:52:06.421435096Z[GMT]")


public class InvoiceRequest   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("customer")
  private Long customer = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("number")
  private String number = null;

  public InvoiceRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(example = "3659.23", required = true, description = "")
      @NotNull

    public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InvoiceRequest customer(Long customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Unique Id of customer taht represent the owner of invoice
   * @return customer
   **/
  @Schema(example = "1", required = true, description = "Unique Id of customer taht represent the owner of invoice")
      @NotNull

    public Long getCustomer() {
    return customer;
  }

  public void setCustomer(Long customer) {
    this.customer = customer;
  }

  public InvoiceRequest detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   **/
  @Schema(example = "Professional services", description = "")
  
    public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public InvoiceRequest number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Bussines number that identified a invoice
   * @return number
   **/
  @Schema(example = "2548975", required = true, description = "Bussines number that identified a invoice")
      @NotNull

    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceRequest invoiceRequest = (InvoiceRequest) o;
    return Objects.equals(this.amount, invoiceRequest.amount) &&
        Objects.equals(this.customer, invoiceRequest.customer) &&
        Objects.equals(this.detail, invoiceRequest.detail) &&
        Objects.equals(this.number, invoiceRequest.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customer, detail, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
