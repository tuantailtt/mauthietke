/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import bai1.ITinh;
/**
 *
 * @author 84163
 */
public class Context {
  ITinh tinhToan ;
  public Context(){}

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
  public float tinh(float a, float b){
      return tinhToan.tinh(a, b);
  }
}
