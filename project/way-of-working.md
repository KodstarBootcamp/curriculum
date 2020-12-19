# Project Way of Working
This document defines the way of working to be followed  during projects developed as a collaborative project exercise.

## Environment
The project code will be stored in a GitHub repository. Also project tracking/management will be done through GitHub. A project board and a git repository on GitHub is already created. 

## Sprint Workflow 
The following outlines the general development steps in a sprint: 
  1. Backlog grooming: before starting the sprint, the stories should be defined in sufficient detail. During grooming, in the order of priority, details can be added to stories, stories may be split. Stories should be given completion estimates. 
  2. Sprint kickoff: the stories which will be done in the sprint get selected and sprint is kicked off. 
  3. Based on the order of priority, developers pick stories to work on. 
  4. The story gets implemented.  The items described in Code Review part should be kept in mind. 
  5. After story is implemented, a code review should be done. The comments created during review should be resolved before the pull request can be merged. 
  6. The pull request  will be merged to the main branch. 
  7. Developer picks the next story from the sprint plan. 
  8. At the end of the sprint, a retrospective meeting should be done. During this meeting, the sprint will be discussed (good/bad/idea).  
  9. Start new sprint from step 1
## Code Review / Definition of Done 
Before the code can be merged to main branch, a code review should be performed. It is prevented to merge a pull request without a review. Moreover, the main branch is protected on GitHub. Therefore pull requests without an approval cannot be merged to main branch.  The following items define completion criteria for implementation. These needs to be followed during development by developers and also needs to be checked by reviewers during code reviews: 
  * Are all the things described in the story implemented completely? 
  * Are there any warnings/errors during compilation? In rare instances warnings can be disregarded. In those cases, there should be a good reason and this reason needs to be mentioned in code.
  * Are code style rules followed? (Mostly this will be supported by a tool) 
  * Does enough test exist for the new code? Is code coverage sufficient? 
  * Does the code follow general coding best-practices? Any duplication avoided? Is the code understandable enough? 
