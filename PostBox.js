//Javascript meant to be used with jQuery
//Adds actions to a tweet posting box

var main = function() {
    $('.btn').click(function() {
        var post = $('.status-box').val();
        $('<li>').text(post).prependTo('.posts');
        $('.status-box').val("");
        $('.counter').text("140");
        $('.btn').addClass('disabled');
    });
    
    $('.status-box').keyup(function() {
        var postLength = $(this).val().length;
        var charactersLeft = 140 - postLength;
        if (charactersLeft < 0) {
            $('.counter').text("0");
            //Disable - message too long
            $('.btn').addClass('disabled');
        } else if (charactersLeft === 140) {
            $('.counter').text(charactersLeft);
            //Disable - empty message
            $('.btn').addClass('disabled');
        } else {
            $('.counter').text(charactersLeft);
            //enable button
            $('.btn').removeClass('disabled');
        }
    });
    
    $('.btn').addClass('disabled');
};

$(document).ready(main);