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
import com.lwj.PaintNail.utils.*;

import java.sql.Timestamp;

import static com.lwj.PaintNail.utils.RandomUtils.generateTicket;

@RestController
@Slf4j
@Api(value = "社区")
@RequestMapping("/Community")
public class CommunityController {
    @Autowired
    private PostsService postsService;
//    @Autowired
//    private PostOutService postOutService;
//    @Autowired
//    private PostInnerService postInnerService;
//    @Autowired
//    private CollectionService collectionService;

//    @ApiOperation(value = "展示出社区里的所有帖子")
//    @RequestMapping(method = RequestMethod.GET)
//    public RespBean ListAllPosts() {
//        return postOutService.listAll();
//    }
//
//    @ApiOperation(value = "进入一个帖子")
//    @RequestMapping("/EnterPost")
//    public RespBean EnterPost(@RequestParam("Post_id") String Post_id){
//        return postInnerService.enterPost(Post_id);
//    }
//
//    @ApiOperation(value = "收藏一个帖子")
//    @RequestMapping("/EnterPost/CollectPost")
//    public RespBean CollectPost(@RequestParam("Post_id") String Post_id, @RequestParam("User_id") String User_id){
//        String Collection_id = RandomUtils.generateTicket();
//        return collectionService.CollectPost(Collection_id, Post_id, User_id);
//    }

    @ApiOperation(value = "给一个帖子点赞")
    @RequestMapping("/LikePost")
    public RespBean LikePost(@RequestParam("Post_id") String Post_id){
        return postsService.LikePost(Post_id);
    }

    @ApiOperation(value = "发帖")
    @RequestMapping("/Posting")
    public RespBean Posting(@RequestParam("User_id") String User_id, @RequestParam("Post_introduction") String Post_introduction, @RequestParam("Post_contents") String Post_contents, @RequestParam("Post_images") String Post_images){
        java.sql.Timestamp Post_date = Getcurrenttime.getDate();//获取当前时间
        String Post_id = RandomUtils.generateTicket();
        Integer Post_likes = 0;
        return postsService.Posting(Post_id, User_id, Post_introduction, Post_contents, Post_date, Post_likes, Post_images);
    }
}
