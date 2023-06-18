package com.aseproject02.aseprojectattempt07.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aseproject02.aseprojectattempt07.entity.Node;
import com.aseproject02.aseprojectattempt07.service.NodeService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class NodeRest {
	
	@Autowired
	private NodeService nodeService;
	
	
	@PostMapping("/nodes")
	public Node addNode(@RequestBody Node theNode) {
		//System.out.println(theNode);
		return nodeService.save(theNode);
	}
	
	@GetMapping("/getNextNode")
	public Long getNextNodeId() {
		Long nextid = nodeService.getNextId();
		//System.out.println(nextid);
		return nextid;
	}
	
	@PutMapping("/updateNodeData")
	public String updateNode(@RequestBody Node theNode) {
		//System.out.println(theNode);
		Node node = nodeService.findByNodeId(theNode.getId());
		nodeService.deleteById(theNode.getId());
		node.setId(theNode.getId());
		node.setName(theNode.getName());
		this.addNode(node);
		return "Updated Successfull..";
	}

	@GetMapping("/nodes")
	public List<Node> getAllNodes(){
		return nodeService.findAll();
	}
}
