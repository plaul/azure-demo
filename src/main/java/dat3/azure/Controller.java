package dat3.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class Controller {

  @GetMapping
  public String getData(){
    return "[1,2,3]";
  }
}
