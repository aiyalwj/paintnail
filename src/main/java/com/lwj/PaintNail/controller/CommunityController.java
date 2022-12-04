package com.lwj.PaintNail.controller;

import com.lwj.PaintNail.dto.RespBean;
import com.lwj.PaintNail.service.PostsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
    @RequestMapping("/Enterpost")
    public RespBean EnterPost(@RequestParam("Post_id") String Post_id){
        return postsService.enterPost(Post_id);
    }
}
