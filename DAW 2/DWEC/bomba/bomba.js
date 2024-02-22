var bombing = ("bomba1.png","bomba2.png","bomba3.png","bomba4.png","bomba5.png","bomba6.png","bomba7.png","bomba8.png","bomba9.png")

document.addEventListener("DOMContentLoaded", () => {
   var dropped = document.getElementById("droped");
   dropped.addEventListener("dragover",allowDrop);
   dropped.addEventListener("drop",Drop)
   dropped.addEventListener("dragLeave",exitDrop)
   var arraybombes =  document.querySelectorAll("#wrapper");

   for (let i = 0; i < arraybombes.length; i++) {
         document.addEventListener("dragstart",drag)
      
   }
 });

 function drag(ev){
      /*ev.dataTransfer.setData('text');*/
      
 }

 function allowDrop(ev){
   var dropped = document.getElementById("droped");

   dropped.style.backgroundColor= "red";
   
 }
function exitDrop(){
  var dropped = document.getElementById("droped");

  dropped.style.backgroundColor= "green";

}
 function Drop(ev){

 }