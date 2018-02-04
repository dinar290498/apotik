/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author sad
 */
public class dtUser {
  private String userName;
  private String password;
  private int akses;

  public int getAkses()
  {
    return this.akses;
  }

  public void setAkses(int akses) {
    this.akses = akses;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
