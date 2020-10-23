package elm.demo.controller;

import elm.demo.domain.Typeofgoods;
import elm.demo.service.TypeofgoodsService;
import elm.demo.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/typeofgoods")
public class TypeofgoodsrestController {
    @Autowired
    private TypeofgoodsService typeofgoodsService;

    @GetMapping(value = "/list")
    public MessageAndData list(){
        List<Typeofgoods> typeofgoods = typeofgoodsService.selectByExample(null);
        return MessageAndData.success("").add("typesofgoods",typeofgoods);
    }
}
