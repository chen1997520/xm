package com.qf.controller;

import com.qf.pojo.*;
import com.qf.service.GoodsService;
import com.qf.service.ImgService;
import com.qf.service.MessageService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService gsv;
    @Autowired
    private UserService usv;
    @Autowired
    private ImgService isv;
    @Autowired
    private MessageService msv;

    @RequestMapping(value = "/fabu", method = RequestMethod.POST)
    public int fabu(@RequestBody Gq gq, HttpServletRequest request){
        // session 取出登陆 信息
       /* HttpSession session = request.getSession();
        Object obj = session.getAttribute("user2");
        User user2 = null;
        if (obj instanceof User)
            user2 = (User) obj;
        String tel=user2.getTel();*/
       String img="http://res.new.taoertao.com/upload/goods/201911/upload_f4aff76a2d23404f8eb96761fc74013b.jpg?imageView2/1/w/500/h/500/q/100";
        usv.fabu(gq.getQq(),"18711111111");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
        Date time = null;
        try {
            time = df.parse(df.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        gq.getGoods().setImg(img);
        gq.getGoods().setGtime(time);
        gq.getGoods().setUno(1);
        gsv.fabu(gq.getGoods());

        return 0;
    }
    @RequestMapping(value = "/shops/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Gq shops(@PathVariable("id")int id){
        Goods goods=gsv.shops(id);
        User user=usv.shops(goods.getUno());
        Img img=isv.shops(goods.getId());
        Gq gq=new Gq();
        List<String> list=new ArrayList<>();
        list.add(goods.getImg());
        list.add(img.getImg1());
        list.add(img.getImg2());
        list.add(img.getImg3());
        list.add(img.getImg4());
        gq.setList(list);
        gq.setGoods(goods);
        gq.setUser(user);
        return gq;
    }
    @RequestMapping(value = "/mess", method = RequestMethod.POST)
    public void mess(@RequestBody Message message){
        // session 取出登陆 信息
       /* HttpSession session = request.getSession();
        Object obj = session.getAttribute("user2");
        User user2 = null;
        if (obj instanceof User)
            user2 = (User) obj;*/
        msv.mess(message);

    }
    /* 搜索*/
    @RequestMapping("/findByGoodsname")
    public List<Goods> findByGoodsname(@RequestParam("goodsname")String goodsname){
        return gsv.findByGoodsname(goodsname);
    }
    @RequestMapping("/tuijian")
    public List<Goods> tuijian(@RequestParam("collect")String collect){
        return gsv.tuijian(collect);
    }
    @RequestMapping("/zuixin")
    public List <Goods>zuixin(@RequestParam("gtime")String gtime){
        return gsv.zuixin(gtime);
    }
    /*分类*/
    @RequestMapping("/findByGno")
    public List<Goods> findByGno(@RequestParam("gno") Integer gno){
        return  gsv.findByGno(gno);
    }
}
