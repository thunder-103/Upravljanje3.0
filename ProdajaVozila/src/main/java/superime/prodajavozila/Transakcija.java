package superime.prodajavozila;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transakcija implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Transakcija ID")
   private java.lang.Long transakcija_id;
   @org.kie.api.definition.type.Label(value = "Ponuda ID")
   private java.lang.Long ponuda_id;
   @org.kie.api.definition.type.Label(value = "Placeno")
   private java.lang.Boolean placeno;

   public Transakcija()
   {
   }

   public java.lang.Long getTransakcija_id()
   {
      return this.transakcija_id;
   }

   public void setTransakcija_id(java.lang.Long transakcija_id)
   {
      this.transakcija_id = transakcija_id;
   }

   public java.lang.Long getPonuda_id()
   {
      return this.ponuda_id;
   }

   public void setPonuda_id(java.lang.Long ponuda_id)
   {
      this.ponuda_id = ponuda_id;
   }

   public java.lang.Boolean getPlaceno()
   {
      return this.placeno;
   }

   public void setPlaceno(java.lang.Boolean placeno)
   {
      this.placeno = placeno;
   }

   public Transakcija(java.lang.Long transakcija_id, java.lang.Long ponuda_id,
         java.lang.Boolean placeno)
   {
      this.transakcija_id = transakcija_id;
      this.ponuda_id = ponuda_id;
      this.placeno = placeno;
   }

}