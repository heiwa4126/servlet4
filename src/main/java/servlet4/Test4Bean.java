package servlet4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test4Bean {

  @Value("${test4.msg}")
  private String msg;

  public Test4Bean () {
    msg = "";
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String s) {
    msg = s;
  }
}
