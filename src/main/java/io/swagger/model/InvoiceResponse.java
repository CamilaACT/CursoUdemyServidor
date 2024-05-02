package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This model represent a Invoice data that user should send on a request on post method
 */
@Schema(description = "This model represent a Invoice data that user should send on a request on post method")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-01T18:52:06.421435096Z[GMT]")


public class InvoiceResponse   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("customer")
  private Long customer = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("invoiceId")
  private Long invoiceId = null;

  @JsonProperty("number")
  private String number = null;

  public InvoiceResponse amount(Double amount) {
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

  public InvoiceResponse customer(Long customer) {
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

  public InvoiceResponse detail(String detail) {
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

  public InvoiceResponse invoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Unique Id of invoice after it's created
   * @return invoiceId
   **/
  @Schema(example = "2548975", required = true, description = "Unique Id of invoice after it's created")
      @NotNull

    public Long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoiceResponse number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Bussines number that identified a invoice
   * @return number
   **/
  @Schema(example = "TFS2548975", required = true, description = "Bussines number that identified a invoice")
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
    InvoiceResponse invoiceResponse = (InvoiceResponse) o;
    return Objects.equals(this.amount, invoiceResponse.amount) &&
        Objects.equals(this.customer, invoiceResponse.customer) &&
        Objects.equals(this.detail, invoiceResponse.detail) &&
        Objects.equals(this.invoiceId, invoiceResponse.invoiceId) &&
        Objects.equals(this.number, invoiceResponse.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customer, detail, invoiceId, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceResponse {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
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
