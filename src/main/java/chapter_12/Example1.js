var vote_change = function (old_vote, new_vote) {
  var score = get_score();
  if (new_vote !== old_vote) {
    if (new_vote === 'Up') {
      score += (old_vote === 'Up' ? 2 : 1);
    } else if (new_vote === 'Down') {
      score -= (old_vote === 'Up' ? 2 : 1);
    } else if (new_vote === '') {
      score += (old_vote === 'Up' ? -1 : 1);
    }
    set_score(score);
  }
};

function get_score(){}
function set_score(score){}