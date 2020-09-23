$(document).ready(function(){
	
	// start button edit state
		$('table #edit_supp').on('click',function(event){
			event.preventDefault();
			
			var href = $(this).attr('href');
			$.get(href,function(con,status){
				$('#Id').val(con.id);
				$('#Name').val(con.name);
				$('#Detail').val(con.details);
				$('#Site').val(con.website);
				$('#Adresse').val(con.address);
				$('#Etat').val(con.stateid);
				$('#Contry').val(con.contryid);
				$('#City').val(con.city);
				$('#Phone').val(con.phone);
				$('#Mobile').val(con.mobile);
				$('#Email').val(con.email);
			});
			$('#editModal').modal();
		});		
	// end button edit state
	
		
		// start button delete state
			$('table #delete_supp').on('click',function(event){
				event.preventDefault();
				var href = $(this).attr('href');
				$('#confirmDelete').attr('href',href);
				$('#deleteModal').modal();
			});
		// end button delete state
});