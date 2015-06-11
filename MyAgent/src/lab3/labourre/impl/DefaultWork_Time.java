package lab3.labourre.impl;


import jade.util.leap.ArrayList;
import jade.util.leap.Iterator;
import jade.util.leap.List;
import lab3.labourre.Time_DateTimeInterval;
import lab3.labourre.Work_Time;

/**
* Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#Work_Time
* @author OntologyBeanGenerator v4.1
* @version 2015/06/11, 22:22:55
*/
public class DefaultWork_Time implements Work_Time {

  private static final long serialVersionUID = 5987543401077072536L;

  private String _internalInstanceName = null;

  public DefaultWork_Time() {
    this._internalInstanceName = "";
  }

  public DefaultWork_Time(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#shifts
   */
   private List shifts = new ArrayList();
   public void addShifts(Time_DateTimeInterval elem) { 
     shifts.add(elem);
   }
   public boolean removeShifts(Time_DateTimeInterval elem) {
     boolean result = shifts.remove(elem);
     return result;
   }
   public void clearAllShifts() {
     shifts.clear();
   }
   public Iterator getAllShifts() {return shifts.iterator(); }
   public List getShifts() {return shifts; }
   public void setShifts(List l) {shifts = l; }

   /**
   * Protege name: http://mccarthy.dia.fi.upm.es/Labour_Regulatory_Ontology#bll_code
   */
   private List bll_code = new ArrayList();
   public void addBll_code(int elem) { 
     bll_code.add(elem);
   }
   public boolean removeBll_code(int elem) {
     boolean result = bll_code.remove(elem);
     return result;
   }
   public void clearAllBll_code() {
     bll_code.clear();
   }
   public Iterator getAllBll_code() {return bll_code.iterator(); }
   public List getBll_code() {return bll_code; }
   public void setBll_code(List l) {bll_code = l; }

}
