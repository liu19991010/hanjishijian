var i = 0;
  
    function jumper(){
        i++;
        if (i > 5) {
            i = 0;
        }
            $(".ppt ul li").eq(i).fadeIn(100).siblings().fadeOut(100);
       
    }
    setInterval("jumper()",5000);

