$(document).ready(function(){
	
	// start button edit
		$('table #edit_location').on('click',function(event){
			event.preventDefault();
			
			var href = $(this).attr('href');
			
			$.get(href,function(location, status){
				$('#edit_id').val(location.id);
				$('#edit_description').val(location.description);
				$('#edit_address').val(location.address);
				$('#edit_city').val(location.city);
				$('#edit_contry').val(location.contryid);
				$('#edit_stateid').val(location.stateid);
				$('#edit_details').val(location.details);
			});
			
			$('#editModal').modal();
		});
	// end button edit

		
	// start button delete location
		$('table #delete_location').on('click',function(event){
			event.preventDefault();
			var href = $(this).attr('href');
			$('#confirmDelete').attr('href',href);
			$('#deleteLocation').modal();
		});
	// end button delete location
});