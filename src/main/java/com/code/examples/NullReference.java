package com.code.examples;

class NullReference {
  public String getCmdProperty() {
    final String cmd = System.getProperty("cmd");
    return cmd.trim();
  }

  private Employee getEmployee(final int empId, final String empName) {
    Employee employee = null;
    if (empId > 0 && empName != null && empName.length() > 0) {

      //Query from DB
      //Get employee info
      //End

      employee = new Employee();
      employee.setId(empId);
      employee.setName(empName);
    }
    return employee;
  }

  public String getEmployeeString(final int empId, final String empName) {
    final Employee employee = getEmployee(empId, empName);
    return "Employee:" + employee.getId() + " , " + employee.getName();
  }
}
