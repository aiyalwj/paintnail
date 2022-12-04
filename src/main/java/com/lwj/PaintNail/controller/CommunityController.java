package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.PostsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(value = "社区")
@RequestMapping("/Community")
public class CommunityController {
    @Autowired
    private PostsService postsService;

    @ApiOperation(value = "展示出当前帖子里的内容")
    @RequestMapping(method = RequestMethod.GET)
    public RespBean ListAllPosts() {
        return postsService.listAll();
    }

    @ApiOperation(value = "进入一个帖子")
    @RequestMapping("/EnterPost")
    public RespBean EnterPost(@RequestParam("Post_id") String Post_id){
        return postsService.enterPost(Post_id);
    }

    @ApiOperation(value = "给一个帖子点赞")
    @RequestMapping("/LikePost")
    public RespBean LikePost(@RequestParam("Post_id") String Post_id){
        return postsService.LikePost(Post_id);
    }

    @ApiOperation(value = "发帖")
    @RequestMapping("/Posting")
    public RespBean Posting(@RequestParam("Post_id") String Post_id, @RequestParam("User_id") String User_id, @RequestParam("Post_contents") String Post_contents, @RequestParam("Post_likes") int Post_likes, @RequestParam("Post_images") String Post_images){
        DateTimeLiteralExpression.DateTime Post_date = null;//获取当前时间
        return postsService.Posting(Post_id, User_id, Post_contents, Post_date, Post_likes, Post_images);
    }
}
