

$(document).ready(function(){

	$('table #edit_con').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(con,status){
			$('#Id').val(con.id);
			$('#firstName').val(con.firstname);
			$('#lastName').val(con.lastname);
			$('#Email').val(con.email);
			$('#Phone').val(con.phone);
			$('#Remarks').val(con.remarks);
		});
		
		$('#editModal').modal();		
	});
	
	$('table #delete_con').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});