package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Tag;
import generator.service.TagService;
import generator.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author hanzhongtao
* @description 针对表【tag】的数据库操作Service实现
* @createDate 2024-01-25 00:17:01
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




