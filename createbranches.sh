#
# create branches for all users


createbranch () {
  git checkout -b $1
  echo ''
  echo "## Branch of $1." >> README.md
  git commit -am "initial of branch"
  git push origin $1
  git checkout develop
}


createbranch legrandd
createbranch LLagel
createbranch enzojob
createbranch Schmiche
createbranch Haris-Mehinovic
createbranch MatisGourdes
createbranch KSchmidt888
createbranch BollingerJerome
createbranch tMohler57
createbranch noemiebertrand
createbranch isiid
createbranch jonasprob
createbranch Alexis68128
createbranch Mitch0499
createbranch reyTheo


createdevelop () {
  # Create develop branch and push it to remote
  git checkout -b develop
  echo ''
  echo "## Branch of develop" >> README.md
  git commit -am "initial of branch"
  git push origin develop
}
