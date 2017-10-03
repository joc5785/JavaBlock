package controller;

import domain.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import services.jpa.block.BlockJPAService;

import java.util.List;

/**
 * Created by o'connell on 10/2/17.
 */

@Controller
public class BlockController {

    private BlockJPAService blockJPAService;

    @Autowired
    public void setBlockJPAService(BlockJPAService blockJPAService){this.blockJPAService = blockJPAService;}


    @RequestMapping("/blocks/all")
    public List<Block> listBlocks(){return blockJPAService.listAll();}

    @RequestMapping("/block/{index}")
    private Block showBlock(@PathVariable long index){
        return blockJPAService.getByIndex(index);
    }
}
