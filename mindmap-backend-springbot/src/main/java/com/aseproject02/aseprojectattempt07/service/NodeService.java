package com.aseproject02.aseprojectattempt07.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.aseproject02.aseprojectattempt07.entity.Node;

import jakarta.transaction.Transactional;

@Service
public class NodeService implements NodeServiceInterface{
	
	@Autowired(required = true)
	private NodeServiceInterface nodeServiceInterface;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Node save(Node theNode) {
		//System.out.println(theNode);
		return nodeServiceInterface.save(theNode);
	}
	
	public Long getNextId() {
		List<Node> nodes = this.findAll();
		if(nodes.isEmpty())
			return (long) 1;
		return nodes.get(nodes.size()-1).getId()+1;
	}

	@Override
	public <S extends Node> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<Node> findById(Long aLong) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long aLong) {
		return false;
	}

	@Override
	public List<Node> findAll(){
		return nodeServiceInterface.findAll();
	}

	@Override
	public List<Node> findAllById(Iterable<Long> longs) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	public Node findByNodeId(Long id) {
		// TODO Auto-generated method stub
		return nodeServiceInterface.findById(id).orElse(null);
	}
	
	@Transactional
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		nodeServiceInterface.deleteById(id);
	}

	@Override
	public void delete(Node entity) {

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> longs) {

	}

	@Override
	public void deleteAll(Iterable<? extends Node> entities) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public void flush() {

	}

	@Override
	public <S extends Node> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public <S extends Node> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Node> entities) {

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> longs) {

	}

	@Override
	public void deleteAllInBatch() {

	}

	@Override
	public Node getOne(Long aLong) {
		return null;
	}

	@Override
	public Node getById(Long aLong) {
		return null;
	}

	@Override
	public Node getReferenceById(Long aLong) {
		return null;
	}

	@Override
	public <S extends Node> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	public <S extends Node> List<S> findAll(Example<S> example) {
		return null;
	}

	@Override
	public <S extends Node> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public <S extends Node> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Override
	public <S extends Node> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Node> boolean exists(Example<S> example) {
		return false;
	}

	@Override
	public <S extends Node, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return null;
	}

	@Override
	public List<Node> findAll(Sort sort) {
		return null;
	}

	@Override
	public Page<Node> findAll(Pageable pageable) {
		return null;
	}
}
