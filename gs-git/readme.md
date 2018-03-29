# less info on git status
# -s, --short
git status -s 

# dig into git history
git log --oneline
git log --oneline --all
git log --oneline --all --graph
git log --oneline --all --graph --decorate
git log --oneline --all --graph --decorate -4
git log --oneline --all --graph --decorate -since "2 days"

# put HEAD pointer on new branch created
git branch `name`
git branch `name` `hash`
git checkout `name`
git checkout -b `name`
git checkout `hash`

# delete branch
git branch -d `name`
git show `hash`
git branch --merged
git branch --no-merged

# merge
git merge `branch-from`
git merge `branch-from` --no-ff
git merge `branch-from` --ff-only


# reset 
git reset --hard HEAD

# stash
git stash




# ? how to recover staged but not commited changes

# notes
HEAD - pointer to last commit in current active branch or
Detached HEAD - HEAD that is not refers to any branch but only to commit
Dangling commit