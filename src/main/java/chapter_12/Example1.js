var vote_change = function (old_vote, new_vote) {
    var weight = get_weight();
    // if (new_vote !== old_vote) {
    //     if (new_vote === 'Up') {
    //         weight += (old_vote === 'Up' ? 2 : 1);
    //     } else if (new_vote === 'Down') {
    //         weight -= (old_vote === 'Up' ? 2 : 1);
    //     } else if (new_vote === '') {
    //         weight += (old_vote === 'Up' ? -1 : 1);
    //     }
    //     set_weight(weight);
    // }
    weight -= get_vote_value(old_vote);
    weight += get_vote_value(new_vote);

    set_weight(weight);
};

function get_vote_value(vote) {
    if(vote === 'Up'){
        return +1;
    }
    if(vote === 'Down'){
        return -1;
    }
    return 0;
}

function get_weight() {
}
function set_weight(weight) {
}