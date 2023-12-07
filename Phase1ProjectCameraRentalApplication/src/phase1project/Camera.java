package phase1project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Camera {
private int id;
private String brand;
private String model;
private double pricePerDay;
private boolean status;
public Camera(int id, String brand, String model, double pricePerDay, boolean status) {
this.id = id;
this.brand = brand;
this.model = model;
this.pricePerDay = pricePerDay;
this.status = status;
}
public int getId() {
return id;
}
public String getBrand() {
return brand;
}
public String getModel() {
return model;
}
public double getPricePerDay() {
return pricePerDay;
}
public boolean isStatus() {
return status;
}
public void setStatus(boolean status) {
this.status = status;
}
}
