package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.Story;
import com.example.Humanely_project.model.Repositories.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoryService {

        private StoryRepository storyRepository;

        @Autowired
        public StoryService(StoryRepository storyRepository) {
            this.storyRepository = storyRepository;
        }

        public List<Story> getStory() {
            return storyRepository.findAll();
        }
        public Optional<Story> getStory(Integer storyId ){
            return storyRepository.findById(storyId);
        }
        public void addNewStory(Story story){
            storyRepository.save(story);
        }

//        public void deleteUsers(Integer storyId) {
//            storyRepository.deleteById(storyId);
//        }


    }
