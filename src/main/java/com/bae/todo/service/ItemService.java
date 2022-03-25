package com.bae.todo.service;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.bae.todo.config.DatabaseSequence;

import com.bae.todo.dto.ItemsDTO;
import com.bae.todo.dto.ListNameDTO;
import com.bae.todo.entity.Items;
import com.bae.todo.entity.ListName;
import com.bae.todo.repo.ItemRepo;



import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;



@Service
public class ItemService {

	public ItemRepo repo;

	private ModelMapper mapper;
	
	@Autowired 
	private MongoOperations mongoOperations;
	
	@Autowired
	public ItemService(ItemRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}
	
	// this doesnt work :( 
//	public static FindAndModifyOptions options() {
//		  return new FindAndModifyOptions();
//		}
//	
//	public long generateSequence(String seqName) {
//		Query query = new Query();
//		Update update = new Update();
//		query.addCriteria(Criteria.where("_id").is(seqName));
//		DatabaseSequence counter = mongoOperations.findAndModify(query, update.inc("seq",1), FindAndModifyOptions.options().upsert(true).returnNew(true), DatabaseSequence.class);
//			    return !Objects.isNull(counter) ? counter.getSeq() : 1;
//			}
	
//	items.setQuickId(generateSequence(Items.SEQUENCE_NAME));

	public Items createItems(Items items) {
		Items newItem = repo.insert(items); 
		 return newItem; 
	}
	
//	public Items updateItems(Items Items, Integer id) {
//		Items toUpdate = this.repo.findById(id).get();
//		toUpdate.setName(Items.getName());
//		toUpdate.setDescription(Items.getDescription());
//		toUpdate.setDate(Items.getDate());
//		toUpdate.setList_id(Items.getList_id());
//		return this.repo.save(toUpdate);
//	}
	
//	public void deleteItems(Integer id) {
//	    repo.deleteByQuickId(id);
//	}
	
//	public Items getItemsById(Integer id) {
//		return repo.findById(id).get();
//	}
	
	public List<Items> getAllItems() {
		return repo.findAll();
		
	}
//	public List<Items> getItemssFromList(ListName list) {	
//		return this.repo.findByList(list);
//	}

	
//	private ItemsDTO mapToDTO(ListName list_id) {
//		ItemsDTO dto = new ItemsDTO();
//		dto.setName(list_id.getName());
//		dto.setDescription(list_id.getDescription());
//		dto.setId(list_id.getId());
//		return dto;		
//	}
//
//	public List<Items> getByList(Integer id) {
//		return this.repo.findByList_Id(id); 
//	}

}

