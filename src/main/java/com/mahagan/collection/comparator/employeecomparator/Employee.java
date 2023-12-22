package com.mahagan.collection.comparator.employeecomparator;

public class Employee implements Comparable
{
    String name;
    int EmId;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", EmId=" + EmId +
                '}';
    }

    public Employee(String name, int emId) {
        this.name = name;
        EmId = emId;
    }

    @Override
    public int compareTo(Object o)
    {
        int emid1=this.EmId;
        Employee employee=(Employee)o;
        int emid2=employee.EmId;
        if(emid1<emid2)
        {
            return -1;
        }
        else if (emid1>emid2)
        {
            return +1;
        }
        else
        {
            return 0;
        }
    }
}
