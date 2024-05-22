# Java-Practice

First of all, we need to make a new repository in GitHub.

Then we have to clone that repository in our Local Drive.
git clone <repository URL>

Now we have to "cd" into the repository folder
cd Java-Practice

Now we have to make a remote origin. So, copy the https link for your repository (it should end with .git)
git remote add origin https://github.com/Ranger10sam/Java-Practice.git

Now stage the changes
git add .

Now Commit the changes
git commit -m "Adding comment"

Now push your changes to your desired branch
git push -u origin feature1

This will prompt you in the GitHub to create new Pull Request.
Now Create the Pull Request from the "feature1" branch to "master".

Switch to the master branch and you will see the Pull Request. Just see and Merge it with the master branch
