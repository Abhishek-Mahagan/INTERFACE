package com.mahagan.hasrel;

public class Toys
{
    private int PackId;
    private String Color;
    private int MagDate;
    private Double Price;
    private String CompName;

    public int getPackId() {
        return PackId;
    }

    public void setPackId(int packId) {
        PackId = packId;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMagDate() {
        return MagDate;
    }

    public void setMagDate(int magDate) {
        MagDate = magDate;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getCompName() {
        return CompName;
    }

    public void setCompName(String compName) {
        CompName = compName;
    }

    public Toys(int packId, String color, int magDate, Double price, String compName) {
        PackId = packId;
        Color = color;
        MagDate = magDate;
        Price = price;
        CompName = compName;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "PackId=" + PackId +
                ", Color='" + Color + '\'' +
                ", MagDate=" + MagDate +
                ", Price=" + Price +
                ", CompName='" + CompName + '\'' +
                '}';
    }
}
