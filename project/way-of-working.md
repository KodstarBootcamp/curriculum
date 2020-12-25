# Project Way of Working
This document defines the way of working to be followed  during projects developed as a collaborative project exercise.

## Environment
The project code will be stored in a GitHub repository. Also project tracking/management will be done through GitHub. A project board and a git repository on GitHub is already created. 

## Sprint Workflow 
The following outlines the general development steps in a sprint: 
  1. Backlog grooming: before starting the sprint, the stories should be defined in sufficient detail. During grooming, in the order of priority, details can be added to stories, stories may be split. Stories should be given completion estimates. 
  2. Sprint kickoff: the stories which will be done in the sprint get selected and sprint is kicked off. Testing of user stories can be planned with some delay wrt implementation.
  3. Based on the order of priority, developers pick stories to work on. 
  4. Developer creates a feature branch to implement the user story. Branch name shall be meaningful. For example, for a user story to implement backend for creating an issue, it can be named as 'create-issue-backend'.
  4. The story gets implemented. The items described in 'Definition of Done; part should be kept in mind.
  5. When story is implemented, if other layer of that story was already merged to main, it is developer's responsibility to integrate her/his changes to already developed parts on main. If any problem is detected about a previously implemented part during integration, a bug issue can be created.
  6. After story is implemented, a pull request should be created. While creating pull request, issue number should be mentioned in description (or it can be linked after creating pull request as described [here](https://docs.github.com/en/free-pro-team@latest/github/managing-your-work-on-github/linking-a-pull-request-to-an-issue)).
  7. After pull request is created, a code review should be done. Another team member should review the change requested by pull request. The comments created during review should be resolved before the pull request can be merged. 
  8. The pull request  will be merged to the main branch.
  9. Developer picks the next story from the sprint plan. 
  10. At the end of the sprint, a retrospective meeting should be done. During this meeting, the sprint will be discussed (good/bad/idea).  
  11. Start new sprint from step 1
## Code Review / Definition of Done 
Before the code can be merged to main branch, a code review should be performed. It is prevented to merge a pull request without a review. Moreover, the main branch is protected on GitHub. Therefore pull requests without an approval cannot be merged to main branch.  The following items define completion criteria for implementation. These needs to be followed during development by developers and also needs to be checked by reviewers during code reviews: 
  * Are all the things described in the story implemented completely? 
  * Are there any warnings/errors during compilation? In rare instances warnings can be disregarded. In those cases, there should be a good reason and this reason needs to be mentioned in code.
  * Are code style rules followed? (Mostly this will be supported by a tool) 
  * Does enough test exist for the new code? Is code coverage sufficient? 
  * Does the code follow general coding best-practices? Any duplication avoided? Is the code understandable enough? 
