package com.example.micro.Controller;

import com.example.micro.Service.CommentaireService;
import com.example.micro.Service.IForumService;
import com.example.micro.classes.Forum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @AllArgsConstructor
        @RequestMapping("/Forum")
public class ForumController {
    IForumService iServiceForum;
    // http://localhost:8099/Micro/Forum/retrieve-all-Forum
    @GetMapping("/retrieve-all-Forum")
    public List<Forum> getallForum()
    {
        List<Forum> listForums = iServiceForum.retrieveAllForums();
        return listForums ;
    }
    // http://localhost:8099/Micro/Forum/add-Forum
    @PostMapping("/add-Forum")
    public Forum addForum(@RequestBody Forum f)
    {
        return iServiceForum.addForum(f);
    }
    // http://localhost:8099/Micro/Forum/retrieve-Forum
    @GetMapping("/retrieve-Forum/{id-Forum}")
    public Forum getForum(@PathVariable("id-Forum") Integer idForum)
    {
        return iServiceForum.retrieveForum(idForum);
    }
    // http://localhost:8099/Micro/Forum/update-Forum
    @PutMapping("/update-Forum")
    public Forum updateForum(@RequestBody Forum f)
    {
        return iServiceForum.updateForum(f);
    }

    // http://localhost:8099/Micro/Forum/remove-Forum
    @DeleteMapping("/remove-Forum/{id-Forum}")
    public void removeForum(@PathVariable("id-Forum") Integer idForum)
    {
        iServiceForum.removeForum(idForum);
    }

}
